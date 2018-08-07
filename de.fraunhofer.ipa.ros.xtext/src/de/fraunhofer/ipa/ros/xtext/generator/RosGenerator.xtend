/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Node
import ros.Publisher

//import org.w3c.dom.Entity


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RosGenerator extends AbstractGenerator {
	

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (node : resource.allContents.toIterable.filter(Node)){
			fsa.generateFile(node.getName()+".cpp",node.compile)
			}
		}

def compile(Node node) '''
            «FOR pub : node.publisher»
                «pub.compile»
            «ENDFOR»
            '''
            
def compile(Publisher pub)
            
'''
#include "ros/ros.h"
#include "std_msgs/String.h"

int main(int argc, char **argv)
{
 
  ros::init(argc, argv, "«pub.name»");
  ros::NodeHandle n;
  ros::Publisher «pub.name»_pub = n.advertise<std_msgs::String>("«pub.name»", 1000);
  ros::Rate loop_rate(10);

  int count = 0;
  while (ros::ok())
  {
    std_msgs::String msg;
    std::stringstream ss;
    ss << "hello world " << count;
    msg.data = ss.str();
    ROS_INFO("%s", msg.data.c_str());
    «pub.name»_pub.publish(msg);
    ros::spinOnce();
    loop_rate.sleep();
    ++count;
  }

  return 0;
}
'''
}



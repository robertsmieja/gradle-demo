package com.robertsmieja.demo.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloWorldPlugin implements Plugin<Project>{

    public static final String PLUGIN_NAME = 'helloWorld'
    HelloWorldSpec helloWorldSpec

    @Override
    void apply(Project project) {
        helloWorldSpec = project.extensions.create(PLUGIN_NAME, HelloWorldSpec)

        project.tasks.create(PLUGIN_NAME) {
            doLast {
                println "Hello ${project."$PLUGIN_NAME".value}"
            }
        }
    }
}

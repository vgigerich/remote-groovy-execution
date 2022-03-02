package com.github.vgigerich.remotegroovyexecution.services

import com.intellij.openapi.project.Project
import com.github.vgigerich.remotegroovyexecution.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

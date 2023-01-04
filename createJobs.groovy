pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job'){
    definition{
        cpsSCM{
            scm{
                git{
                    remote{
                        url 'https://github.com/GarethPark/spring-boot-api-example'
                    }
                    branch'master'
                }
            }
        }
    }
}
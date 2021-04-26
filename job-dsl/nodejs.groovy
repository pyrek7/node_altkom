job ('niodejs job')
{
    scm {
        git('https://github.com/pyrek7/node_altkom.git') { node ->
                node / gitConfigName('DSL script')
                node / gitConfigEmail('jenkins-dsl-script@altkom.com')
            }
    }

    triggers {
        scm('H/5 * * * *')
    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        	shell('node app.js')
    }
}
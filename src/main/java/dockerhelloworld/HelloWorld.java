package dockerhelloworld;

/**
 * https://www.youtube.com/watch?v=FzwIs2jMESM&list=PLgcKMlJueAM5TOhhyPpFshUd-In7YwCQW&index=7
 *
 * C:\JavaCode\Docker
 * docker build -f src/dockerhelloworld/Dockerfile -t hello-world:1.0 .
 *
 * docker run hello-world:1.0
 *
 *
 * docker run -it hello-world:1.0 sh
 */

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello woorld");
    }
}

/***
 * trash notes:
 * java -classpath out\production\Docker dockerhelloworld.Main
 *
 */
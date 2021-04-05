# java-demo
normal java demo
用来演示github action，手动执行以下命令可以构建镜像：
```shell
cd demowebapp && mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

mkdir -p demowebapp/build/dependency && (cd demowebapp/build/dependency; jar -xf ../libs/*.jar)

cd demowebapp && docker build -t springio/demowebapp-docker . && cd ..
```
启动命令如下：
```shell
docker run --rm -p 8080:8080 springio/demowebapp-docker
```

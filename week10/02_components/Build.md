# Build 방법

## `Manifest.mf` 수정
```
Manifest-Version: 1.0
Main-class: components.ButtonDemo
```

## 터미널 창에서 수행

```bash
cd week10/02_components/components-ButtonDemoProject
javac -d build/classes src/components/*.java
jar cfm dist/ButtonDemoProject.jar manifest.mf `
  -C build/classes . `
  -C src components/images
java -jar dist/ButtonDemoProject.jar

```


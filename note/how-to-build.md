# how to build

## desc


## content


### make some config
`build.gradle`


`WEB-INF/web.xml`

### prepare source code
```sh
# make dir
mkdir -p "src\main\webapp\WEB-INF"

# add file and content
#...
```

### build

```sh
# build
gradle assemble
# check ouput files
ls build/libs

#deploy
# copy build/libs/*.war to webapp path in tomcat serve

# setup tomcat serve

# curl to
```
(defproject b-social/lein-git-down "0.4.3"
  :description "A Leiningen plugin for resolving Clojure(Script) dependencies from a Git repository"
  :url "http://github.com/b-social/lein-git-down"
  :license {:name "MIT"}
  :dependencies [[org.clojure/tools.gitlibs "2.5.190"]
                 [org.eclipse.jgit/org.eclipse.jgit "4.10.0.201712302008-r"]
                 [leiningen "2.9.4" :scope "provided" :exclusions [commons-codec org.apache.httpcomponents/httpclient org.slf4j/slf4j-api org.apache.httpcomponents/httpcore]]]
  :deploy-repositories [["github" {:url "https://maven.pkg.github.com/b-social/lein-git-down"
                                   :username :env/GITHUB_ACTOR
                                   :password :env/GITHUB_TOKEN
                                   :sign-releases false}]])

package hello.login;

public class Constants {

    public enum Whitelist {
        ALL("/"),
        MEMBER_ADD("/members/add"),
        LOGIN("/login"),
        LOGOUT("/logout"),
        CSS("/css/**"),
        ICO("/*.ico"),
        ERROR("/error");

        private String path;

        Whitelist(String path) {
            this.path = path;
        }

        public String getPath() {
            return path;
        }
    }
}

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean nextUpper = false;

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            if (c == ' ') {
                builder.append('_');
            } else if (c == '-') {
                nextUpper = true;
            } else {
                if (c == '4') {
                    c = 'a';
                } else if (c == '3') {
                    c = 'e';
                } else if (c == '0') {
                    c = 'o';
                } else if (c == '1') {
                    c = 'l';
                } else if (c == '7') {
                    c = 't';
                }

                if (Character.isLetter(c)) {
                    if (nextUpper) {
                        c = Character.toUpperCase(c);
                        nextUpper = false;
                    }
                    builder.append(c);
                }
            }
        }

        return builder.toString();
    }
}


package com.hova;

public final class GroupedStrings {

    public final static int t1 = 123;
    public final int t2 = 123;


    public final static void main(final String[] args)
    {
        final String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] lines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
        };
        String res = printTextPerRole(roles,lines);
        System.out.println(res);
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();

        for(String role: roles) {
            res.append(role + ":\n");
            int i=1;
            for (String line: textLines)
            {
                if (line.startsWith(role + ":")) {
                    res.append(i+") "+line.substring(role.length() + 2) + "\n");
                }
                i++;
            }
            res.append("\n");
        }
        return res.toString();
    }

}

package ak;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f682c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f683d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f685b;

    public p(String str, String str2) {
        this.f684a = str;
        this.f685b = str2;
    }

    public static p a(String str) {
        Matcher matcher = f682c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f683d.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(m6.a.i(m1.m("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \""), str, '\"'));
                }
                str2 = strGroup3;
            }
        }
        return new p(str, str2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).f684a.equals(this.f684a);
    }

    public final int hashCode() {
        return this.f684a.hashCode();
    }

    public final String toString() {
        return this.f684a;
    }
}

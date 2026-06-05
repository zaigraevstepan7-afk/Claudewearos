package nj;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12342a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f12343b;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        fj.l.e(charsetForName, "forName(...)");
        f12342a = charsetForName;
        fj.l.e(Charset.forName("UTF-16"), "forName(...)");
        fj.l.e(Charset.forName("UTF-16BE"), "forName(...)");
        fj.l.e(Charset.forName("UTF-16LE"), "forName(...)");
        fj.l.e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        fj.l.e(charsetForName2, "forName(...)");
        f12343b = charsetForName2;
    }
}

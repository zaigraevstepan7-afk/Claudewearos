package sb;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import rb.c;
import ub.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14958c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f14959d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f14960e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f14961f;

    /* renamed from: a, reason: collision with root package name */
    public final String f14962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14963b;

    static {
        String strA = hj.a.A("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f14958c = strA;
        String strA2 = hj.a.A("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = hj.a.A("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f14959d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f14960e = new a(strA, null);
        f14961f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f14962a = str;
        this.f14963b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}

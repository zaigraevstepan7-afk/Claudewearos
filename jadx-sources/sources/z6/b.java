package z6;

import fj.l;
import java.util.Locale;
import nj.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20441b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20443d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20444e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20445f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20446g;

    public b(int i10, String str, String str2, String str3, boolean z2, int i11) {
        l.f(str, "name");
        l.f(str2, "type");
        this.f20440a = str;
        this.f20441b = str2;
        this.f20442c = z2;
        this.f20443d = i10;
        this.f20444e = str3;
        this.f20445f = i11;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        l.e(upperCase, "toUpperCase(...)");
        this.f20446g = nj.e.C0(upperCase, "INT", false) ? 3 : (nj.e.C0(upperCase, "CHAR", false) || nj.e.C0(upperCase, "CLOB", false) || nj.e.C0(upperCase, "TEXT", false)) ? 2 : nj.e.C0(upperCase, "BLOB", false) ? 5 : (nj.e.C0(upperCase, "REAL", false) || nj.e.C0(upperCase, "FLOA", false) || nj.e.C0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                boolean z2 = this.f20443d > 0;
                b bVar = (b) obj;
                int i10 = bVar.f20445f;
                if (z2 == (bVar.f20443d > 0) && l.b(this.f20440a, bVar.f20440a) && this.f20442c == bVar.f20442c) {
                    String str = bVar.f20444e;
                    int i11 = this.f20445f;
                    String str2 = this.f20444e;
                    if ((i11 != 1 || i10 != 2 || str2 == null || u3.a.b(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || u3.a.b(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : u3.a.b(str2, str))) && this.f20446g == bVar.f20446g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f20440a.hashCode() * 31) + this.f20446g) * 31) + (this.f20442c ? 1231 : 1237)) * 31) + this.f20443d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f20440a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f20441b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f20446g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f20442c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f20443d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f20444e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return f.s0(f.u0(sb2.toString()));
    }
}

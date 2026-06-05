package u1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f16582a;

    /* renamed from: b, reason: collision with root package name */
    public String f16583b;

    public boolean a() {
        return this.f16582a >= this.f16583b.length();
    }

    public w8.c b() {
        w8.c cVar = new w8.c();
        cVar.f18942a = this.f16582a;
        cVar.f18943b = this.f16583b;
        return cVar;
    }

    public void c() throws m {
        if (d(')')) {
            return;
        }
        g("expected )");
        throw null;
    }

    public boolean d(char c6) {
        int i10 = this.f16582a;
        String str = this.f16583b;
        return i10 < str.length() && str.charAt(this.f16582a) == c6;
    }

    public int e(String str) throws m {
        Integer numB0 = nj.l.B0(f(str));
        if (numB0 != null) {
            return numB0.intValue();
        }
        g("expected int");
        throw null;
    }

    public String f(String str) {
        int i10 = this.f16582a;
        String str2 = this.f16583b;
        while (this.f16582a < str2.length() && !nj.e.D0(str, str2.charAt(this.f16582a))) {
            this.f16582a++;
        }
        int i11 = this.f16582a;
        if (i11 <= i10) {
            return "";
        }
        String strSubstring = str2.substring(i10, i11);
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public void g(String str) throws m {
        int i10 = this.f16582a;
        String str2 = this.f16583b;
        int iMin = Math.min(i10, str2.length());
        StringBuilder sbK = m6.a.k("Error while parsing source information: ", str, " at ");
        String strSubstring = str2.substring(0, iMin);
        fj.l.e(strSubstring, "substring(...)");
        sbK.append(strSubstring);
        sbK.append('|');
        String strSubstring2 = str2.substring(iMin);
        fj.l.e(strSubstring2, "substring(...)");
        sbK.append(strSubstring2);
        throw new m(sbK.toString());
    }
}

package h8;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final gf.f f7707a = new gf.f(Boolean.TRUE);

    public static x a(String str) {
        String str2 = kk.t.f9726b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file");
        sb2.append(':');
        if (str != null) {
            sb2.append(str);
        }
        return new x(sb2.toString(), str2, "file", null, str);
    }

    public static final Drawable b(j jVar, Resources resources) {
        return jVar instanceof e ? ((e) jVar).f7698a : jVar instanceof a ? new BitmapDrawable(resources, ((a) jVar).f7686a) : new k(jVar, 0);
    }

    public static final j c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new a(((BitmapDrawable) drawable).getBitmap()) : new e(drawable);
    }

    public static final Object d(r8.g gVar, gf.f fVar) {
        Object obj = gVar.f13884r.f7703a.get(fVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = gVar.f13886t.f13858n.f7703a.get(fVar);
        return obj2 == null ? fVar.f7406a : obj2;
    }

    public static final Object e(r8.n nVar, gf.f fVar) {
        Object obj = nVar.j.f7703a.get(fVar);
        return obj == null ? fVar.f7406a : obj;
    }

    public static final String f(x xVar) {
        List listG = g(xVar);
        String str = xVar.f7735b;
        if (listG.isEmpty()) {
            return null;
        }
        String str2 = xVar.f7738e;
        fj.l.c(str2);
        if (!nj.l.A0(str2, str)) {
            str = "";
        }
        return qi.l.E0(listG, xVar.f7735b, str, null, null, 60);
    }

    public static final List g(x xVar) {
        String str = xVar.f7738e;
        if (str == null) {
            return qi.s.f13520a;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            int iH0 = nj.e.H0(str, '/', i11, 4);
            if (iH0 == -1) {
                iH0 = str.length();
            }
            String strSubstring = str.substring(i11, iH0);
            fj.l.e(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i10 = iH0;
        }
        return arrayList;
    }

    public static final String h(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMax) {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    wd.a.p(0, i11, bArr.length);
                    return new String(bArr, 0, i11, nj.a.f12342a);
                }
            } else if (str.charAt(i10) == '%') {
                int i12 = i10 + 3;
                try {
                    String strSubstring = str.substring(i10 + 1, i12);
                    fj.l.e(strSubstring, "substring(...)");
                    x8.a.n(16);
                    bArr[i11] = (byte) Integer.parseInt(strSubstring, 16);
                    i11++;
                    i10 = i12;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
        }
    }

    public static x i(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = kk.t.f9726b;
        String strZ0 = !fj.l.b(str2, "/") ? nj.l.z0(str, str2, "/") : str;
        int i10 = 0;
        boolean z2 = true;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (i10 < strZ0.length()) {
            char cCharAt = strZ0.charAt(i10);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i13 == -1 && i11 == -1) {
                            i13 = i10 + 1;
                        }
                    } else if (z2 && i13 == -1 && i11 == -1) {
                        int i16 = i10 + 2;
                        if (i16 < str.length() && str.charAt(i10 + 1) == '/' && str.charAt(i16) == '/') {
                            i14 = i10 + 3;
                            z2 = false;
                            i15 = i10;
                            i10 = i16;
                        } else if (strZ0.equals(str)) {
                            i12 = i10 + 1;
                            i15 = i10;
                            i10 = i12;
                            i14 = i10;
                        }
                    }
                } else if (i12 == -1 && i13 == -1 && i11 == -1) {
                    i12 = i14 == -1 ? 0 : i10;
                    z2 = false;
                }
            } else if (i11 == -1) {
                i11 = i10 + 1;
            }
            i10++;
        }
        int i17 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int iMin = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, strZ0.length());
        int iMin2 = Math.min(i13 == -1 ? Integer.MAX_VALUE : i13 - 1, iMin);
        if (i14 != -1) {
            strSubstring2 = strZ0.substring(0, i15);
            fj.l.e(strSubstring2, "substring(...)");
            if (i12 != -1) {
                i17 = i12;
            }
            strSubstring = strZ0.substring(i14, Math.min(i17, iMin2));
            fj.l.e(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i12 != -1) {
            strSubstring3 = strZ0.substring(i12, iMin2);
            fj.l.e(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i13 != -1) {
            strSubstring4 = strZ0.substring(i13, iMin);
            fj.l.e(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i11 != -1) {
            strSubstring5 = strZ0.substring(i11, strZ0.length());
            fj.l.e(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strH = strSubstring2 != null ? h(strSubstring2, bArr) : null;
        String strH2 = strSubstring != null ? h(strSubstring, bArr) : null;
        String strH3 = strSubstring3 != null ? h(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            h(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            h(strSubstring5, bArr);
        }
        return new x(strZ0, str2, strH, strH2, strH3);
    }
}

package gk;

import android.os.Parcel;
import f1.i0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final boolean a(int i10) {
        return !rf.a.a();
    }

    public static final boolean b(int i10) {
        Boolean bool;
        if (rf.a.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                rf.a.f14378a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int c(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 == 1) {
            return "account_selection_token";
        }
        if (i10 == 2) {
            return "account_selection_state";
        }
        throw null;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int f(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static int g(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int h(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static int i(int i10, int i11, boolean z2) {
        return (Boolean.hashCode(z2) + i10) * i11;
    }

    public static int j(int i10, long j, int i11) {
        return (Long.hashCode(j) + i10) * i11;
    }

    public static ClassCastException k(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String l(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String m(int i10, String str) {
        return i10 + str;
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String o(StringBuilder sb2, float f10, char c6) {
        sb2.append(f10);
        sb2.append(c6);
        return sb2.toString();
    }

    public static StringBuilder p(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder q(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static xd.a r(Parcel parcel) {
        xd.a aVarN = xd.b.n(parcel.readStrongBinder());
        parcel.recycle();
        return aVarN;
    }

    public static void s(int i10, int i11, int i12, int i13, int i14) {
        n2.d.a(i10);
        n2.d.a(i11);
        n2.d.a(i12);
        n2.d.a(i13);
        n2.d.a(i14);
    }

    public static void t(int i10, i0 i0Var, v2.e eVar, i0 i0Var2, v2.d dVar) {
        f1.s.w(i0Var, Integer.valueOf(i10), eVar);
        f1.s.I(dVar, i0Var2);
    }

    public static void u(int i10, i0 i0Var, v2.e eVar, i0 i0Var2, v2.d dVar) {
        f1.s.w(i0Var, Integer.valueOf(i10), eVar);
        f1.s.I(dVar, i0Var2);
    }
}

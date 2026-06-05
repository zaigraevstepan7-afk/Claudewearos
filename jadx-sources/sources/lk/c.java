package lk;

import fj.l;
import kk.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.i f11002a;

    /* renamed from: b, reason: collision with root package name */
    public static final kk.i f11003b;

    /* renamed from: c, reason: collision with root package name */
    public static final kk.i f11004c;

    /* renamed from: d, reason: collision with root package name */
    public static final kk.i f11005d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.i f11006e;

    static {
        kk.i iVar = kk.i.f9700d;
        f11002a = mk.b.p("/");
        f11003b = mk.b.p("\\");
        f11004c = mk.b.p("/\\");
        f11005d = mk.b.p(".");
        f11006e = mk.b.p("..");
    }

    public static final int a(t tVar) {
        kk.i iVar = tVar.f9727a;
        if (iVar.e() != 0) {
            if (iVar.r(0) != 47) {
                if (iVar.r(0) == 92) {
                    if (iVar.e() > 2 && iVar.r(1) == 92) {
                        kk.i iVar2 = f11003b;
                        l.f(iVar2, "other");
                        int i10 = iVar.i(2, iVar2.p());
                        return i10 == -1 ? iVar.e() : i10;
                    }
                } else if (iVar.e() > 2 && iVar.r(1) == 58 && iVar.r(2) == 92) {
                    char cR = (char) iVar.r(0);
                    if ('a' <= cR && cR < '{') {
                        return 3;
                    }
                    if ('A' <= cR && cR < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final t b(t tVar, t tVar2, boolean z2) {
        l.f(tVar2, "child");
        if (a(tVar2) != -1 || tVar2.i() != null) {
            return tVar2;
        }
        kk.i iVarC = c(tVar);
        if (iVarC == null && (iVarC = c(tVar2)) == null) {
            iVarC = f(t.f9726b);
        }
        kk.f fVar = new kk.f();
        fVar.T(tVar.f9727a);
        if (fVar.f9695b > 0) {
            fVar.T(iVarC);
        }
        fVar.T(tVar2.f9727a);
        return d(fVar, z2);
    }

    public static final kk.i c(t tVar) {
        kk.i iVar = tVar.f9727a;
        kk.i iVar2 = f11002a;
        if (kk.i.o(iVar, iVar2) != -1) {
            return iVar2;
        }
        kk.i iVar3 = tVar.f9727a;
        kk.i iVar4 = f11003b;
        if (kk.i.o(iVar3, iVar4) != -1) {
            return iVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kk.t d(kk.f r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.c.d(kk.f, boolean):kk.t");
    }

    public static final kk.i e(byte b10) {
        if (b10 == 47) {
            return f11002a;
        }
        if (b10 == 92) {
            return f11003b;
        }
        throw new IllegalArgumentException(m6.a.d(b10, "not a directory separator: "));
    }

    public static final kk.i f(String str) {
        if (l.b(str, "/")) {
            return f11002a;
        }
        if (l.b(str, "\\")) {
            return f11003b;
        }
        throw new IllegalArgumentException(m1.i("not a directory separator: ", str));
    }
}

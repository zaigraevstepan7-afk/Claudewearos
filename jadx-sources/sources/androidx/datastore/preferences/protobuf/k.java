package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f953a;

    /* renamed from: b, reason: collision with root package name */
    public int f954b;

    /* renamed from: c, reason: collision with root package name */
    public int f955c;

    /* renamed from: d, reason: collision with root package name */
    public int f956d;

    /* renamed from: e, reason: collision with root package name */
    public Object f957e;

    public /* synthetic */ k(int i10) {
        this.f953a = i10;
    }

    public static void X(int i10) throws com.google.crypto.tink.shaded.protobuf.c0 {
        if ((i10 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.c0.f();
        }
    }

    public static void Y(int i10) throws com.google.crypto.tink.shaded.protobuf.c0 {
        if ((i10 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.c0.f();
        }
    }

    public void A(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 2) {
            int I = jVar.I();
            if ((I & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iF = jVar.f() + I;
            do {
                ((v0) xVar).add(Float.valueOf(jVar.y()));
            } while (jVar.f() < iF);
            return;
        }
        if (i10 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Float.valueOf(jVar.y()));
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void B(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.s)) {
            int i10 = this.f954b & 7;
            if (i10 == 2) {
                int I = jVar.I();
                X(I);
                int iF = jVar.f() + I;
                do {
                    list.add(Float.valueOf(jVar.y()));
                } while (jVar.f() < iF);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            do {
                list.add(Float.valueOf(jVar.y()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.s sVar = (com.google.crypto.tink.shaded.protobuf.s) list;
        int i11 = this.f954b & 7;
        if (i11 == 2) {
            int I2 = jVar.I();
            X(I2);
            int iF2 = jVar.f() + I2;
            do {
                sVar.e(jVar.y());
            } while (jVar.f() < iF2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        do {
            sVar.e(jVar.y());
            if (jVar.g()) {
                return;
            } else {
                iH2 = jVar.H();
            }
        } while (iH2 == this.f954b);
        this.f956d = iH2;
    }

    public void C(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.z()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.z()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void D(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.z()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Integer.valueOf(jVar.z()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                xVar.e(jVar.z());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            xVar.e(jVar.z());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void E(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.A()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.A()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void F(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.j0)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.A()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Long.valueOf(jVar.A()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = (com.google.crypto.tink.shaded.protobuf.j0) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                j0Var.e(jVar.A());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            j0Var.e(jVar.A());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void G(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 2) {
            int I = jVar.I();
            if ((I & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iF = jVar.f() + I;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.B()));
            } while (jVar.f() < iF);
            return;
        }
        if (i10 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.B()));
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void H(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 2) {
                int I = jVar.I();
                X(I);
                int iF = jVar.f() + I;
                do {
                    list.add(Integer.valueOf(jVar.B()));
                } while (jVar.f() < iF);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            do {
                list.add(Integer.valueOf(jVar.B()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 2) {
            int I2 = jVar.I();
            X(I2);
            int iF2 = jVar.f() + I2;
            do {
                xVar.e(jVar.B());
            } while (jVar.f() < iF2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        do {
            xVar.e(jVar.B());
            if (jVar.g()) {
                return;
            } else {
                iH2 = jVar.H();
            }
        } while (iH2 == this.f954b);
        this.f956d = iH2;
    }

    public void I(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.C()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int I = jVar.I();
        if ((I & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iF = jVar.f() + I;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.C()));
        } while (jVar.f() < iF);
    }

    public void J(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.j0)) {
            int i10 = this.f954b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(jVar.C()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int I = jVar.I();
            Y(I);
            int iF = jVar.f() + I;
            do {
                list.add(Long.valueOf(jVar.C()));
            } while (jVar.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = (com.google.crypto.tink.shaded.protobuf.j0) list;
        int i11 = this.f954b & 7;
        if (i11 == 1) {
            do {
                j0Var.e(jVar.C());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int I2 = jVar.I();
        Y(I2);
        int iF2 = jVar.f() + I2;
        do {
            j0Var.e(jVar.C());
        } while (jVar.f() < iF2);
    }

    public void K(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.D()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.D()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void L(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.D()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Integer.valueOf(jVar.D()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                xVar.e(jVar.D());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            xVar.e(jVar.D());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void M(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.E()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.E()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void N(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.j0)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.E()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Long.valueOf(jVar.E()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = (com.google.crypto.tink.shaded.protobuf.j0) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                j0Var.e(jVar.E());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            j0Var.e(jVar.E());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void O(x xVar, boolean z2) throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        String strF;
        int iH;
        j jVar = (j) this.f957e;
        if ((this.f954b & 7) != 2) {
            throw a0.b();
        }
        do {
            if (z2) {
                V(2);
                strF = jVar.G();
            } else {
                V(2);
                strF = jVar.F();
            }
            ((v0) xVar).add(strF);
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void P(List list, boolean z2) throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        String strF;
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if ((this.f954b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        if ((list instanceof com.google.crypto.tink.shaded.protobuf.f0) && !z2) {
            com.google.crypto.tink.shaded.protobuf.f0 f0Var = (com.google.crypto.tink.shaded.protobuf.f0) list;
            do {
                f0Var.o(o());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        do {
            if (z2) {
                V(2);
                strF = jVar.G();
            } else {
                V(2);
                strF = jVar.F();
            }
            list.add(strF);
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void Q(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.I()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.I()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void R(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.I()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Integer.valueOf(jVar.I()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                xVar.e(jVar.I());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            xVar.e(jVar.I());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void S(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.J()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.J()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void T(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.j0)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.J()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Long.valueOf(jVar.J()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = (com.google.crypto.tink.shaded.protobuf.j0) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                j0Var.e(jVar.J());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            j0Var.e(jVar.J());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public void U(int i10) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        switch (this.f953a) {
            case 0:
                if (((j) this.f957e).f() != i10) {
                    throw a0.e();
                }
                return;
            default:
                if (((j) this.f957e).f() != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.c0.g();
                }
                return;
        }
    }

    public void V(int i10) throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        switch (this.f953a) {
            case 0:
                if ((this.f954b & 7) != i10) {
                    throw a0.b();
                }
                return;
            default:
                if ((this.f954b & 7) != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.c0.c();
                }
                return;
        }
    }

    public boolean W() {
        int i10;
        j jVar = (j) this.f957e;
        if (jVar.g() || (i10 = this.f954b) == this.f955c) {
            return false;
        }
        return jVar.K(i10);
    }

    public void a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f956d;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.f957e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f957e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f957e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f957e;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f956d++;
    }

    public v0.t b(int i10) {
        return new v0.t(u1.b.q((g3.k0) this.f957e, i10), i10, 1L);
    }

    public void c(RecyclerView recyclerView, boolean z2) {
        this.f956d = 0;
        int[] iArr = (int[]) this.f957e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        t6.e0 e0Var = recyclerView.E;
        if (recyclerView.D == null || e0Var == null || !e0Var.f15877i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1179d.v()) {
                e0Var.i(recyclerView.D.a(), this);
            }
        } else if (!recyclerView.J()) {
            e0Var.h(this.f954b, this.f955c, recyclerView.w0, this);
        }
        int i10 = this.f956d;
        if (i10 > e0Var.j) {
            e0Var.j = i10;
            e0Var.f15878k = z2;
            recyclerView.f1175b.l();
        }
    }

    public int d() {
        return this.f956d - this.f955c;
    }

    public int e() {
        switch (this.f953a) {
            case 0:
                int i10 = this.f956d;
                if (i10 != 0) {
                    this.f954b = i10;
                    this.f956d = 0;
                } else {
                    this.f954b = ((j) this.f957e).H();
                }
                int i11 = this.f954b;
                return (i11 == 0 || i11 == this.f955c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i11 >>> 3;
            default:
                int i12 = this.f956d;
                if (i12 != 0) {
                    this.f954b = i12;
                    this.f956d = 0;
                } else {
                    this.f954b = ((j) this.f957e).H();
                }
                int i13 = this.f954b;
                return (i13 == 0 || i13 == this.f955c) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i13 >>> 3;
        }
    }

    public int f(int i10) {
        return ((j1.l0) this.f957e).f8642d[this.f955c + i10];
    }

    public Object g(int i10) {
        return ((j1.l0) this.f957e).f8644f[this.f956d + i10];
    }

    public void h(Object obj, x0 x0Var, o oVar) {
        int i10 = this.f955c;
        this.f955c = ((this.f954b >>> 3) << 3) | 4;
        try {
            x0Var.i(obj, this, oVar);
            if (this.f954b == this.f955c) {
            } else {
                throw new a0("Failed to parse the message.");
            }
        } finally {
            this.f955c = i10;
        }
    }

    public void i(Object obj, com.google.crypto.tink.shaded.protobuf.b1 b1Var, com.google.crypto.tink.shaded.protobuf.o oVar) {
        int i10 = this.f955c;
        this.f955c = ((this.f954b >>> 3) << 3) | 4;
        try {
            b1Var.j(obj, this, oVar);
            if (this.f954b == this.f955c) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.c0.f();
            }
        } finally {
            this.f955c = i10;
        }
    }

    public void j(Object obj, x0 x0Var, o oVar) throws a0 {
        j jVar = (j) this.f957e;
        int I = jVar.I();
        if (jVar.f948a >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iQ = jVar.q(I);
        jVar.f948a++;
        x0Var.i(obj, this, oVar);
        jVar.b(0);
        jVar.f948a--;
        jVar.o(iQ);
    }

    public void k(Object obj, com.google.crypto.tink.shaded.protobuf.b1 b1Var, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.c0 {
        j jVar = (j) this.f957e;
        int I = jVar.I();
        if (jVar.f948a >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iQ = jVar.q(I);
        jVar.f948a++;
        b1Var.j(obj, this, oVar);
        jVar.b(0);
        jVar.f948a--;
        jVar.o(iQ);
    }

    public void l(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Boolean.valueOf(jVar.r()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Boolean.valueOf(jVar.r()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public void m(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.e)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(jVar.r()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Boolean.valueOf(jVar.r()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.e eVar = (com.google.crypto.tink.shaded.protobuf.e) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                eVar.e(jVar.r());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            eVar.e(jVar.r());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public g n() throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        V(2);
        return ((j) this.f957e).s();
    }

    public com.google.crypto.tink.shaded.protobuf.i o() throws z, com.google.crypto.tink.shaded.protobuf.b0 {
        V(2);
        return ((j) this.f957e).t();
    }

    public void p(x xVar) throws z {
        int iH;
        j jVar = (j) this.f957e;
        if ((this.f954b & 7) != 2) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(n());
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void q(List list) throws com.google.crypto.tink.shaded.protobuf.b0 {
        int iH;
        j jVar = (j) this.f957e;
        if ((this.f954b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        do {
            list.add(o());
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void r(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 1) {
            do {
                ((v0) xVar).add(Double.valueOf(jVar.u()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int I = jVar.I();
        if ((I & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iF = jVar.f() + I;
        do {
            ((v0) xVar).add(Double.valueOf(jVar.u()));
        } while (jVar.f() < iF);
    }

    public void s(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.m)) {
            int i10 = this.f954b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(jVar.u()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int I = jVar.I();
            Y(I);
            int iF = jVar.f() + I;
            do {
                list.add(Double.valueOf(jVar.u()));
            } while (jVar.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.m mVar = (com.google.crypto.tink.shaded.protobuf.m) list;
        int i11 = this.f954b & 7;
        if (i11 == 1) {
            do {
                mVar.e(jVar.u());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int I2 = jVar.I();
        Y(I2);
        int iF2 = jVar.f() + I2;
        do {
            mVar.e(jVar.u());
        } while (jVar.f() < iF2);
    }

    public void t(x xVar) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.v()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int iF = jVar.f() + jVar.I();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.v()));
        } while (jVar.f() < iF);
        U(iF);
    }

    public String toString() {
        switch (this.f953a) {
            case 3:
                return "";
            case 4:
            default:
                return super.toString();
            case 5:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i10 = this.f954b;
                sb2.append(i10);
                sb2.append('-');
                g3.k0 k0Var = (g3.k0) this.f957e;
                sb2.append(u1.b.q(k0Var, i10));
                sb2.append(',');
                int i11 = this.f955c;
                sb2.append(i11);
                sb2.append('-');
                sb2.append(u1.b.q(k0Var, i11));
                sb2.append("), prevOffset=");
                return m6.a.g(sb2, this.f956d, ')');
        }
    }

    public void u(List list) throws com.google.crypto.tink.shaded.protobuf.c0, a0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.v()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int iF = jVar.f() + jVar.I();
            do {
                list.add(Integer.valueOf(jVar.v()));
            } while (jVar.f() < iF);
            U(iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 0) {
            do {
                xVar.e(jVar.v());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int iF2 = jVar.f() + jVar.I();
        do {
            xVar.e(jVar.v());
        } while (jVar.f() < iF2);
        U(iF2);
    }

    public Object v(s1 s1Var, Class cls, o oVar) throws com.google.crypto.tink.shaded.protobuf.b0, a0 {
        j jVar = (j) this.f957e;
        switch (s1Var.ordinal()) {
            case 0:
                V(1);
                return Double.valueOf(jVar.u());
            case 1:
                V(5);
                return Float.valueOf(jVar.y());
            case 2:
                V(0);
                return Long.valueOf(jVar.A());
            case 3:
                V(0);
                return Long.valueOf(jVar.J());
            case 4:
                V(0);
                return Integer.valueOf(jVar.z());
            case 5:
                V(1);
                return Long.valueOf(jVar.x());
            case 6:
                V(5);
                return Integer.valueOf(jVar.w());
            case 7:
                V(0);
                return Boolean.valueOf(jVar.r());
            case 8:
                V(2);
                return jVar.G();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                V(2);
                x0 x0VarA = u0.f1025c.a(cls);
                w wVarD = x0VarA.d();
                j(wVarD, x0VarA, oVar);
                x0VarA.b(wVarD);
                return wVarD;
            case 11:
                return n();
            case 12:
                V(0);
                return Integer.valueOf(jVar.I());
            case 13:
                V(0);
                return Integer.valueOf(jVar.v());
            case 14:
                V(5);
                return Integer.valueOf(jVar.B());
            case 15:
                V(1);
                return Long.valueOf(jVar.C());
            case 16:
                V(0);
                return Integer.valueOf(jVar.D());
            case 17:
                V(0);
                return Long.valueOf(jVar.E());
        }
    }

    public void w(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 2) {
            int I = jVar.I();
            if ((I & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iF = jVar.f() + I;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.w()));
            } while (jVar.f() < iF);
            return;
        }
        if (i10 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.w()));
            if (jVar.g()) {
                return;
            } else {
                iH = jVar.H();
            }
        } while (iH == this.f954b);
        this.f956d = iH;
    }

    public void x(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
            int i10 = this.f954b & 7;
            if (i10 == 2) {
                int I = jVar.I();
                X(I);
                int iF = jVar.f() + I;
                do {
                    list.add(Integer.valueOf(jVar.w()));
                } while (jVar.f() < iF);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            do {
                list.add(Integer.valueOf(jVar.w()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
        int i11 = this.f954b & 7;
        if (i11 == 2) {
            int I2 = jVar.I();
            X(I2);
            int iF2 = jVar.f() + I2;
            do {
                xVar.e(jVar.w());
            } while (jVar.f() < iF2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        do {
            xVar.e(jVar.w());
            if (jVar.g()) {
                return;
            } else {
                iH2 = jVar.H();
            }
        } while (iH2 == this.f954b);
        this.f956d = iH2;
    }

    public void y(x xVar) throws a0 {
        int iH;
        j jVar = (j) this.f957e;
        int i10 = this.f954b & 7;
        if (i10 == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.x()));
                if (jVar.g()) {
                    return;
                } else {
                    iH = jVar.H();
                }
            } while (iH == this.f954b);
            this.f956d = iH;
            return;
        }
        if (i10 != 2) {
            throw a0.b();
        }
        int I = jVar.I();
        if ((I & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iF = jVar.f() + I;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.x()));
        } while (jVar.f() < iF);
    }

    public void z(List list) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iH;
        int iH2;
        j jVar = (j) this.f957e;
        if (!(list instanceof com.google.crypto.tink.shaded.protobuf.j0)) {
            int i10 = this.f954b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(jVar.x()));
                    if (jVar.g()) {
                        return;
                    } else {
                        iH = jVar.H();
                    }
                } while (iH == this.f954b);
                this.f956d = iH;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.c0.c();
            }
            int I = jVar.I();
            Y(I);
            int iF = jVar.f() + I;
            do {
                list.add(Long.valueOf(jVar.x()));
            } while (jVar.f() < iF);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = (com.google.crypto.tink.shaded.protobuf.j0) list;
        int i11 = this.f954b & 7;
        if (i11 == 1) {
            do {
                j0Var.e(jVar.x());
                if (jVar.g()) {
                    return;
                } else {
                    iH2 = jVar.H();
                }
            } while (iH2 == this.f954b);
            this.f956d = iH2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.c0.c();
        }
        int I2 = jVar.I();
        Y(I2);
        int iF2 = jVar.f() + I2;
        do {
            j0Var.e(jVar.x());
        } while (jVar.f() < iF2);
    }

    public k(j jVar) {
        this.f953a = 0;
        this.f956d = 0;
        Charset charset = y.f1035a;
        this.f957e = jVar;
        jVar.f949b = this;
    }

    public k(j jVar, byte b10) {
        this.f953a = 1;
        this.f956d = 0;
        com.google.crypto.tink.shaded.protobuf.a0.a(jVar, "input");
        this.f957e = jVar;
        jVar.f949b = this;
    }

    public k(j1.l0 l0Var) {
        this.f953a = 2;
        this.f957e = l0Var;
    }

    public k(int i10, int i11, int i12, g3.k0 k0Var) {
        this.f953a = 5;
        this.f954b = i10;
        this.f955c = i11;
        this.f956d = i12;
        this.f957e = k0Var;
    }
}

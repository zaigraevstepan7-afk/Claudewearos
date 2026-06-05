package d2;

import c2.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final b0.b f4680r = new b0.b(17);

    /* renamed from: d, reason: collision with root package name */
    public final s f4681d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4682e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4683f;

    /* renamed from: g, reason: collision with root package name */
    public final r f4684g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4685h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f4686i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final i f4687k;

    /* renamed from: l, reason: collision with root package name */
    public final p f4688l;

    /* renamed from: m, reason: collision with root package name */
    public final m f4689m;

    /* renamed from: n, reason: collision with root package name */
    public final i f4690n;

    /* renamed from: o, reason: collision with root package name */
    public final p f4691o;

    /* renamed from: p, reason: collision with root package name */
    public final m f4692p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4693q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d10 = rVar.f4694a;
        boolean z2 = d10 == -3.0d;
        double d11 = rVar.f4700g;
        double d12 = rVar.f4699f;
        if (z2) {
            final int i11 = 4;
            iVar = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i12 = 5;
            iVar = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i12;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i13 = 6;
            iVar = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i13;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i14;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i15;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i16;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i17;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() { // from class: d2.o
                @Override // d2.i
                public final double b(double d13) {
                    int i122 = i18;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f4630a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f4630a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f4695b;
                            return d13 >= rVar2.f4698e ? Math.pow((d14 * d13) + rVar2.f4696c, rVar2.f4694a) : d13 * rVar2.f4697d;
                        case 3:
                            double d15 = rVar2.f4695b;
                            double d16 = rVar2.f4696c;
                            double d17 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e ? Math.pow((d15 * d13) + d16, rVar2.f4694a) + rVar2.f4699f : (d17 * d13) + rVar2.f4700g;
                        case 4:
                            float[] fArr4 = d.f4630a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f4630a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f4695b;
                            double d19 = rVar2.f4696c;
                            double d20 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d20 ? (Math.pow(d13, 1.0d / rVar2.f4694a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f4695b;
                            double d22 = rVar2.f4696c;
                            double d23 = rVar2.f4697d;
                            return d13 >= rVar2.f4698e * d23 ? (Math.pow(d13 - rVar2.f4699f, 1.0d / rVar2.f4694a) - d22) / d21 : (d13 - rVar2.f4700g) / d23;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    @Override // d2.c
    public final float a(int i10) {
        return this.f4683f;
    }

    @Override // d2.c
    public final float b(int i10) {
        return this.f4682e;
    }

    @Override // d2.c
    public final boolean c() {
        return this.f4693q;
    }

    @Override // d2.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f4692p;
        float fB = (float) mVar.b(d10);
        float fB2 = (float) mVar.b(f11);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f4686i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f14 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // d2.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f4692p;
        float fB = (float) mVar.b(d10);
        float fB2 = (float) mVar.b(f11);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f4686i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // d2.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f4684g;
        if (Float.compare(qVar.f4682e, this.f4682e) != 0 || Float.compare(qVar.f4683f, this.f4683f) != 0 || !fj.l.b(this.f4681d, qVar.f4681d) || !Arrays.equals(this.f4685h, qVar.f4685h)) {
            return false;
        }
        r rVar2 = this.f4684g;
        if (rVar2 != null) {
            return fj.l.b(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (fj.l.b(this.f4687k, qVar.f4687k)) {
            return fj.l.b(this.f4690n, qVar.f4690n);
        }
        return false;
    }

    @Override // d2.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f4689m;
        return e0.b((float) mVar.b(f14), (float) mVar.b(f15), (float) mVar.b(f16), f13, cVar);
    }

    @Override // d2.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f4685h) + ((this.f4681d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f4682e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f4683f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f4684g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f4690n.hashCode() + ((this.f4687k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r33, float[] r34, d2.s r35, float[] r36, d2.i r37, d2.i r38, float r39, float r40, d2.r r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.<init>(java.lang.String, float[], d2.s, float[], d2.i, d2.i, float, float, d2.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i10) {
        i iVar;
        i iVar2 = f4680r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: d2.n
                @Override // d2.i
                public final double b(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: d2.n
                @Override // d2.i
                public final double b(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}

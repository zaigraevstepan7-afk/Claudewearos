package t;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f15216a;

    public k0(j0 j0Var) {
        this.f15216a = j0Var;
    }

    @Override // t.v, t.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final x1 a(p1 p1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        j0 j0Var = this.f15216a;
        q.v vVar = j0Var.f15199b;
        q.u uVar = new q.u(vVar.f13100e + 2);
        q.v vVar2 = new q.v(vVar.f13100e);
        int[] iArr3 = vVar.f13097b;
        Object[] objArr3 = vVar.f13098c;
        long[] jArr = vVar.f13096a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            i10 = i12;
                            i0 i0Var = (i0) objArr3[i15];
                            uVar.a(i16);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            vVar2.i(i16, new w1((p) p1Var.f15249a.invoke(i0Var.f15189a), i0Var.f15190b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j >>= i10;
                        i14++;
                        iArr3 = iArr2;
                        i12 = i10;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!vVar.a(0)) {
            int i17 = uVar.f13137b;
            if (i17 < 0) {
                r.a.d("Index must be between 0 and size");
                throw null;
            }
            uVar.b(i17 + 1);
            int[] iArr4 = uVar.f13136a;
            int i18 = uVar.f13137b;
            if (i18 != 0) {
                qi.k.e0(1, 0, i18, iArr4, iArr4);
            }
            iArr4[0] = 0;
            uVar.f13137b++;
        }
        if (!vVar.a(j0Var.f15198a)) {
            uVar.a(j0Var.f15198a);
        }
        int i19 = uVar.f13137b;
        if (i19 != 0) {
            int[] iArr5 = uVar.f13136a;
            fj.l.f(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i19);
        }
        return new x1(uVar, vVar2, j0Var.f15198a, y.f15329d);
    }
}

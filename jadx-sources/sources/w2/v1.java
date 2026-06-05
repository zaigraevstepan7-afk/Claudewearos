package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v1 extends androidx.lifecycle.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final q.v f18442b;

    public v1() {
        q.v vVar = q.l.f13102a;
        this.f18442b = new q.v();
    }

    @Override // androidx.lifecycle.x0
    public final void d() {
        q.v vVar = this.f18442b;
        int[] iArr = vVar.f13097b;
        Object[] objArr = vVar.f13098c;
        long[] jArr = vVar.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        int i15 = iArr[i14];
                        q.b0 b0Var = (q.b0) objArr[i14];
                        Object[] objArr2 = b0Var.f13033a;
                        int i16 = b0Var.f13034b;
                        int i17 = 0;
                        while (i17 < i16) {
                            u1 u1Var = (u1) objArr2[i17];
                            int i18 = i11;
                            f1.g gVar = u1Var.f18430d;
                            if (gVar != null) {
                                gVar.cancel();
                            }
                            u1Var.f18430d = null;
                            q1.c cVar = (q1.c) u1Var.f18427a.f18374b;
                            cVar.f13177b = true;
                            cVar.f13176a = false;
                            cVar.a();
                            i17++;
                            i11 = i18;
                        }
                    }
                    int i19 = i11;
                    j >>= i19;
                    i13++;
                    i11 = i19;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}

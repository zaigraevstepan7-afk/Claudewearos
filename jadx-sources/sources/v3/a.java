package v3;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import t2.z;
import t4.m1;
import t4.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends androidx.datastore.preferences.protobuf.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f17807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i10) {
        super(1);
        this.f17806c = i10;
        this.f17807d = viewGroup;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final m1 m(m1 m1Var, List list) {
        switch (this.f17806c) {
            case 0:
                return ((w) this.f17807d).m(m1Var);
            default:
                w3.t tVar = (w3.t) this.f17807d;
                if (tVar.F) {
                    return m1Var;
                }
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? m1Var : m1Var.f15751a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final q5.b n(v0 v0Var, q5.b bVar) {
        switch (this.f17806c) {
            case 0:
                v2.s sVar = ((w) this.f17807d).S.Y.f17583c;
                if (!sVar.f17751k0.G) {
                    return bVar;
                }
                long jD0 = yd.f.d0(sVar.q0(0L));
                int i10 = (int) (jD0 >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jD0 & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jI = z.h(sVar).I();
                int i12 = (int) (jI >> 32);
                int i13 = (int) (jI & 4294967295L);
                long j = sVar.f15552c;
                long jD02 = yd.f.d0(sVar.q0((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (jD02 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jD02));
                int i16 = i15 >= 0 ? i15 : 0;
                return (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) ? bVar : new q5.b(7, h.l((l4.b) bVar.f13235b, i10, i11, i14, i16), h.l((l4.b) bVar.f13236c, i10, i11, i14, i16));
            default:
                w3.t tVar = (w3.t) this.f17807d;
                if (tVar.F) {
                    return bVar;
                }
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return bVar;
                }
                l4.b bVarC = l4.b.c(iMax, iMax2, iMax3, iMax4);
                int i17 = bVarC.f9967a;
                l4.b bVar2 = (l4.b) bVar.f13235b;
                int i18 = bVarC.f9968b;
                int i19 = bVarC.f9969c;
                int i20 = bVarC.f9970d;
                return new q5.b(7, m1.b(bVar2, i17, i18, i19, i20), m1.b((l4.b) bVar.f13236c, i17, i18, i19, i20));
        }
    }
}

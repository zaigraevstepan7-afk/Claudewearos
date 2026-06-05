package l7;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends p {
    public ArrayList V;
    public boolean W;
    public int X;
    public boolean Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public p[] f10014a0;

    @Override // l7.p
    public final void A(View view) {
        super.A(view);
        p[] pVarArr = this.f10014a0;
        this.f10014a0 = null;
        if (pVarArr == null) {
            pVarArr = new p[this.V.size()];
        }
        p[] pVarArr2 = (p[]) this.V.toArray(pVarArr);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVarArr2[i10].A(view);
        }
        Arrays.fill(pVarArr2, (Object) null);
        this.f10014a0 = pVarArr2;
    }

    @Override // l7.p
    public final void B() {
        if (this.V.isEmpty()) {
            J();
            m();
            return;
        }
        u uVar = new u();
        uVar.f10077b = this;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((p) obj).a(uVar);
        }
        this.X = this.V.size();
        if (this.W) {
            ArrayList arrayList2 = this.V;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((p) obj2).B();
            }
            return;
        }
        for (int i12 = 1; i12 < this.V.size(); i12++) {
            ((p) this.V.get(i12 - 1)).a(new u((p) this.V.get(i12), 2));
        }
        p pVar = (p) this.V.get(0);
        if (pVar != null) {
            pVar.B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // l7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.C(long, long):void");
    }

    @Override // l7.p
    public final void D(long j) {
        ArrayList arrayList;
        this.f10064c = j;
        if (j < 0 || (arrayList = this.V) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.V.get(i10)).D(j);
        }
    }

    @Override // l7.p
    public final void E(a.a aVar) {
        this.Z |= 8;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.V.get(i10)).E(aVar);
        }
    }

    @Override // l7.p
    public final void F(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) this.V.get(i10)).F(timeInterpolator);
            }
        }
        this.f10065d = timeInterpolator;
    }

    @Override // l7.p
    public final void G(ef.f fVar) {
        super.G(fVar);
        this.Z |= 4;
        if (this.V != null) {
            for (int i10 = 0; i10 < this.V.size(); i10++) {
                ((p) this.V.get(i10)).G(fVar);
            }
        }
    }

    @Override // l7.p
    public final void H() {
        this.Z |= 2;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.V.get(i10)).H();
        }
    }

    @Override // l7.p
    public final void I(long j) {
        this.f10063b = j;
    }

    @Override // l7.p
    public final String K(String str) {
        String strK = super.K(str);
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strK);
            sb2.append("\n");
            sb2.append(((p) this.V.get(i10)).K(str + "  "));
            strK = sb2.toString();
        }
        return strK;
    }

    public final void L(p pVar) {
        this.V.add(pVar);
        pVar.B = this;
        long j = this.f10064c;
        if (j >= 0) {
            pVar.D(j);
        }
        if ((this.Z & 1) != 0) {
            pVar.F(this.f10065d);
        }
        if ((this.Z & 2) != 0) {
            pVar.H();
        }
        if ((this.Z & 4) != 0) {
            pVar.G(this.O);
        }
        if ((this.Z & 8) != 0) {
            pVar.E(null);
        }
    }

    @Override // l7.p
    public final void c() {
        super.c();
        p[] pVarArr = this.f10014a0;
        this.f10014a0 = null;
        if (pVarArr == null) {
            pVarArr = new p[this.V.size()];
        }
        p[] pVarArr2 = (p[]) this.V.toArray(pVarArr);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVarArr2[i10].c();
        }
        Arrays.fill(pVarArr2, (Object) null);
        this.f10014a0 = pVarArr2;
    }

    @Override // l7.p
    public final void d(w wVar) {
        View view = wVar.f10080b;
        if (u(view)) {
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p pVar = (p) obj;
                if (pVar.u(view)) {
                    pVar.d(wVar);
                    wVar.f10081c.add(pVar);
                }
            }
        }
    }

    @Override // l7.p
    public final void f(w wVar) {
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.V.get(i10)).f(wVar);
        }
    }

    @Override // l7.p
    public final void g(w wVar) {
        View view = wVar.f10080b;
        if (u(view)) {
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p pVar = (p) obj;
                if (pVar.u(view)) {
                    pVar.g(wVar);
                    wVar.f10081c.add(pVar);
                }
            }
        }
    }

    @Override // l7.p
    /* renamed from: j */
    public final p clone() {
        a aVar = (a) super.clone();
        aVar.V = new ArrayList();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVarClone = ((p) this.V.get(i10)).clone();
            aVar.V.add(pVarClone);
            pVarClone.B = aVar;
        }
        return aVar;
    }

    @Override // l7.p
    public final void l(ViewGroup viewGroup, wh.s sVar, wh.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f10063b;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.V.get(i10);
            if (j > 0 && (this.W || i10 == 0)) {
                long j4 = pVar.f10063b;
                if (j4 > 0) {
                    pVar.I(j4 + j);
                } else {
                    pVar.I(j);
                }
            }
            pVar.l(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    @Override // l7.p
    public final boolean s() {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            if (((p) this.V.get(i10)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // l7.p
    public final void x(View view) {
        super.x(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.V.get(i10)).x(view);
        }
    }

    @Override // l7.p
    public final void y() {
        this.P = 0L;
        int i10 = 0;
        u uVar = new u(this, i10);
        while (i10 < this.V.size()) {
            p pVar = (p) this.V.get(i10);
            pVar.a(uVar);
            pVar.y();
            long j = pVar.P;
            if (this.W) {
                this.P = Math.max(this.P, j);
            } else {
                long j4 = this.P;
                pVar.Q = j4;
                this.P = j4 + j;
            }
            i10++;
        }
    }

    @Override // l7.p
    public final p z(m mVar) {
        super.z(mVar);
        return this;
    }
}

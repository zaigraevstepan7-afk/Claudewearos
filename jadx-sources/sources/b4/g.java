package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f1552m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f1545e = 2;
        } else {
            this.f1545e = 3;
        }
    }

    @Override // b4.f
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f1547g = i10;
        ArrayList arrayList = this.f1550k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}

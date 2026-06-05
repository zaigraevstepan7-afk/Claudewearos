package t6;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15914a;

    public i(k kVar) {
        this.f15914a = kVar;
    }

    @Override // t6.h0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        k kVar = this.f15914a;
        int i12 = kVar.f15923a;
        int iComputeVerticalScrollRange = kVar.f15940s.computeVerticalScrollRange();
        int i13 = kVar.f15939r;
        kVar.f15941t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = kVar.f15940s.computeHorizontalScrollRange();
        int i14 = kVar.f15938q;
        boolean z2 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        kVar.f15942u = z2;
        boolean z10 = kVar.f15941t;
        if (!z10 && !z2) {
            if (kVar.f15943v != 0) {
                kVar.f(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i13;
            kVar.f15933l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            kVar.f15932k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (kVar.f15942u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i14;
            kVar.f15936o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            kVar.f15935n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = kVar.f15943v;
        if (i15 == 0 || i15 == 1) {
            kVar.f(1);
        }
    }
}

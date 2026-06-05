package t6;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16074a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f16075b;

    public w0(w wVar) {
        this.f16075b = wVar;
    }

    @Override // t6.h0
    public final void a(int i10) {
        if (i10 == 0 && this.f16074a) {
            this.f16074a = false;
            this.f16075b.f();
        }
    }

    @Override // t6.h0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f16074a = true;
    }
}

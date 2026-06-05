package hf;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f7894b;

    public /* synthetic */ a(r rVar, int i10) {
        this.f7893a = i10;
        this.f7894b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f7893a) {
            case 0:
                d dVar = (d) this.f7894b;
                dVar.s(dVar.t());
                break;
            default:
                m mVar = (m) this.f7894b;
                mVar.f7925l = z2;
                mVar.p();
                if (!z2) {
                    mVar.s(false);
                    mVar.f7926m = false;
                    break;
                }
                break;
        }
    }
}

package ng;

import cg.f;
import pg.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f12341a;

    public c(q qVar) {
        this.f12341a = qVar;
    }

    @Override // cg.f
    public final void a(boolean z2) {
        q qVar = this.f12341a;
        if (z2) {
            qVar.c("app_in_background");
        } else {
            qVar.h("app_in_background");
        }
    }
}

package h8;

import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends ti.a implements qj.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ti.g gVar, int i10) {
        super(gVar);
        this.f7730b = i10;
    }

    @Override // qj.x
    public final void l(Throwable th2, ti.h hVar) {
        switch (this.f7730b) {
            case 0:
            case 1:
                break;
            default:
                Log.e("LauncherApplication", "Uncaught exception in application scope", th2);
                break;
        }
    }

    private final void e0(Throwable th2, ti.h hVar) {
    }

    private final void f0(Throwable th2, ti.h hVar) {
    }
}

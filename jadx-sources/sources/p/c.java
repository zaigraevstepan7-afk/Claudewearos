package p;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f12565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f12566d;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i10) {
        this.f12563a = i10;
        this.f12566d = fVar;
        this.f12564b = str;
        this.f12565c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12563a) {
            case 0:
                this.f12566d.f12580b.extraCallback(this.f12564b, this.f12565c);
                break;
            default:
                this.f12566d.f12580b.onPostMessage(this.f12564b, this.f12565c);
                break;
        }
    }
}

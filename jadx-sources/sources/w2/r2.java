package w2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj.c f18368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(sj.c cVar, Handler handler) {
        super(handler);
        this.f18368a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        this.f18368a.h(pi.o.f13011a);
    }
}

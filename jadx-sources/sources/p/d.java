package p;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f12568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f12570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f12571e;

    public d(f fVar, int i10, Uri uri, boolean z2, Bundle bundle) {
        this.f12571e = fVar;
        this.f12567a = i10;
        this.f12568b = uri;
        this.f12569c = z2;
        this.f12570d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12571e.f12580b.onRelationshipValidationResult(this.f12567a, this.f12568b, this.f12569c, this.f12570d);
    }
}

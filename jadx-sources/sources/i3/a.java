package i3;

import android.text.SegmentFinder;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f8338a;

    public a(j jVar) {
        this.f8338a = jVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f8338a.e(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f8338a.a(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f8338a.b(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f8338a.d(i10);
    }
}

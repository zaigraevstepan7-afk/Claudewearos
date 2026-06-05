package v;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q1 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f17264b = new q1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f17265c = new q1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17266a;

    public /* synthetic */ q1(int i10) {
        this.f17266a = i10;
    }

    @Override // v.o1
    public final boolean a() {
        switch (this.f17266a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // v.o1
    public final n1 b(View view, s3.c cVar) {
        switch (this.f17266a) {
            case 0:
                return new p1(new Magnifier(view));
            default:
                return new r1(new Magnifier(view));
        }
    }
}

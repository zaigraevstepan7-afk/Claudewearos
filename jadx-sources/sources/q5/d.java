package q5;

import android.view.View;
import ef.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13246c;

    public /* synthetic */ d(int i10) {
        this.f13246c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.a
    public final float F(x xVar) {
        switch (this.f13246c) {
            case 0:
                return ((View) xVar).getAlpha();
            case 1:
                return ((View) xVar).getScaleX();
            case 2:
                return ((View) xVar).getScaleY();
            case 3:
                return ((View) xVar).getRotation();
            case 4:
                return ((View) xVar).getRotationX();
            default:
                return ((View) xVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.a
    public final void X(x xVar, float f10) {
        switch (this.f13246c) {
            case 0:
                ((View) xVar).setAlpha(f10);
                break;
            case 1:
                ((View) xVar).setScaleX(f10);
                break;
            case 2:
                ((View) xVar).setScaleY(f10);
                break;
            case 3:
                ((View) xVar).setRotation(f10);
                break;
            case 4:
                ((View) xVar).setRotationX(f10);
                break;
            default:
                ((View) xVar).setRotationY(f10);
                break;
        }
    }
}

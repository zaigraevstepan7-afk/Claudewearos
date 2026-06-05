package cb;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3186b;

    public /* synthetic */ k(m mVar, int i10) {
        this.f3185a = i10;
        this.f3186b = mVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        switch (this.f3185a) {
            case 0:
                fj.l.f(context, "it");
                GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
                gLSurfaceView.setEGLContextClientVersion(2);
                gLSurfaceView.setRenderer(this.f3186b);
                gLSurfaceView.setRenderMode(1);
                return gLSurfaceView;
            default:
                fj.l.f(context, "it");
                GLSurfaceView gLSurfaceView2 = new GLSurfaceView(context);
                gLSurfaceView2.setEGLContextClientVersion(2);
                gLSurfaceView2.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
                gLSurfaceView2.setPreserveEGLContextOnPause(true);
                gLSurfaceView2.setRenderer(this.f3186b);
                gLSurfaceView2.setRenderMode(1);
                gLSurfaceView2.setZOrderOnTop(false);
                gLSurfaceView2.getHolder().setFormat(-3);
                return gLSurfaceView2;
        }
    }
}

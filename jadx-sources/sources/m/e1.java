package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavs;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11081b;

    public /* synthetic */ e1(Object obj, int i10) {
        this.f11080a = i10;
        this.f11081b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f11080a) {
            case 0:
                f1 f1Var = (f1) this.f11081b;
                b1 b1Var = f1Var.G;
                Handler handler = f1Var.K;
                v vVar = f1Var.O;
                int action = motionEvent.getAction();
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (action == 0 && vVar != null && vVar.isShowing() && x2 >= 0 && x2 < vVar.getWidth() && y2 >= 0 && y2 < vVar.getHeight()) {
                    handler.postDelayed(b1Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(b1Var);
                    break;
                }
                break;
            default:
                zzavs zzavsVar = ((mc.m) this.f11081b).A;
                if (zzavsVar != null) {
                    zzavsVar.zzd(motionEvent);
                    break;
                }
                break;
        }
        return false;
    }
}

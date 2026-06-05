package c2;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.anonlab.voidlauncher.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.lang.reflect.Field;
import java.util.Iterator;
import qj.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2984b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f2983a = i10;
        this.f2984b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f2983a;
        Object obj = this.f2984b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                Context context = view.getContext();
                if (!fVar.f2994d) {
                    context.getApplicationContext().registerComponentCallbacks(fVar.f2995e);
                    fVar.f2994d = true;
                    break;
                }
                break;
            case 1:
                hf.q qVar = (hf.q) obj;
                AccessibilityManager accessibilityManager = qVar.M;
                if (qVar.N != null && accessibilityManager != null && qVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(qVar.N);
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                Field field = t4.l0.f15744a;
                t4.b0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        boolean z2;
        switch (this.f2983a) {
            case 0:
                f fVar = (f) this.f2984b;
                Context context = view.getContext();
                if (fVar.f2994d) {
                    context.getApplicationContext().unregisterComponentCallbacks(fVar.f2995e);
                    fVar.f2994d = false;
                    break;
                }
                break;
            case 1:
                hf.q qVar = (hf.q) this.f2984b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = qVar.N;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = qVar.M) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                l.e eVar = (l.e) this.f2984b;
                ViewTreeObserver viewTreeObserver = eVar.Q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.Q = view.getViewTreeObserver();
                    }
                    eVar.Q.removeGlobalOnLayoutListener(eVar.B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                l.q qVar2 = (l.q) this.f2984b;
                ViewTreeObserver viewTreeObserver2 = qVar2.H;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        qVar2.H = view.getViewTreeObserver();
                    }
                    qVar2.H.removeGlobalOnLayoutListener(qVar2.B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f2984b;
                pe.a aVar = hideBottomViewOnScrollBehavior.f3773h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f3772g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f3773h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f2984b;
                pe.a aVar2 = hideViewOnScrollBehavior.f3778c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f3777b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f3778c = null;
                    break;
                }
                break;
            case 6:
                w2.a aVar3 = (w2.a) this.f2984b;
                ViewParent parent = aVar3.getParent();
                Iterator it = (parent == null ? mj.b.f11812a : new mj.d(1, t4.n0.A, new a7.e(parent, 25))).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            fj.l.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (!z2) {
                    aVar3.e();
                    break;
                }
                break;
            case 7:
                view.removeOnAttachStateChangeListener(this);
                ((s1) this.f2984b).e(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}

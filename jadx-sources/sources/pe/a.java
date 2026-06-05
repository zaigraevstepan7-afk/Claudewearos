package pe;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4.a f12869c;

    public /* synthetic */ a(f4.a aVar, View view, int i10) {
        this.f12867a = i10;
        this.f12869c = aVar;
        this.f12868b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        switch (this.f12867a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f12869c;
                if (z2 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f12868b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f12869c;
                if (z2 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.s(this.f12868b);
                    break;
                }
                break;
        }
    }
}

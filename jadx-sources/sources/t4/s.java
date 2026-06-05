package t4;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15772b;

    public /* synthetic */ s(View view, int i10) {
        this.f15771a = i10;
        this.f15772b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15771a) {
            case 0:
                View view = this.f15772b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                View view2 = this.f15772b;
                ((InputMethodManager) i4.c.getSystemService(view2.getContext(), InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}

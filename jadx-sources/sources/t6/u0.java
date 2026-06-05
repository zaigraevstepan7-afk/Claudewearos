package t6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 extends t4.b {

    /* renamed from: d, reason: collision with root package name */
    public final v0 f16065d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f16066e = new WeakHashMap();

    public u0(v0 v0Var) {
        this.f16065d = v0Var;
    }

    @Override // t4.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f15694a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // t4.b
    public final d8.e b(View view) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // t4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // t4.b
    public final void d(View view, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        v0 v0Var = this.f16065d;
        RecyclerView recyclerView = v0Var.f16068d;
        RecyclerView recyclerView2 = v0Var.f16068d;
        boolean zJ = recyclerView.J();
        View.AccessibilityDelegate accessibilityDelegate = this.f15694a;
        if (zJ || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().V(view, eVar);
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            bVar.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // t4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // t4.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        t4.b bVar = (t4.b) this.f16066e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f15694a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // t4.b
    public final boolean g(View view, int i10, Bundle bundle) {
        v0 v0Var = this.f16065d;
        RecyclerView recyclerView = v0Var.f16068d;
        RecyclerView recyclerView2 = v0Var.f16068d;
        if (recyclerView.J() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i10, bundle);
        }
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i10, bundle)) {
                return true;
            }
        } else if (super.g(view, i10, bundle)) {
            return true;
        }
        k0 k0Var = recyclerView2.getLayoutManager().f15870b.f1175b;
        return false;
    }

    @Override // t4.b
    public final void h(View view, int i10) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            bVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // t4.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        t4.b bVar = (t4.b) this.f16066e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

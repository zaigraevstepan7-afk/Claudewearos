package t4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.anonlab.voidlauncher.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f15744a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15745b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f15746c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d, reason: collision with root package name */
    public static final y f15747d = new y();

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f15748e = new a0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        fj.l.f(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void b(View view, m1 m1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsC = m1Var.c();
        if (windowInsetsC != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? i0.a(view, windowInsetsC) : b0.a(view, windowInsetsC);
            if (windowInsetsA.equals(windowInsetsC)) {
                return;
            }
            m1.d(view, windowInsetsA);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(view);
        }
        if (f15745b) {
            return null;
        }
        if (f15744a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f15744a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f15745b = true;
                return null;
            }
        }
        try {
            Object obj = f15744a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f15745b = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(m.r rVar) {
        return Build.VERSION.SDK_INT >= 31 ? j0.a(rVar) : (String[]) rVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z2) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f h(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j0.b(view, fVar);
        }
        y4.h hVar = (y4.h) view.getTag(R.id.tag_on_receive_content_listener);
        n nVar = f15747d;
        if (hVar == null) {
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(fVar);
        }
        f fVarA = y4.h.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(fVarA);
    }

    public static void i(View view, int i10) {
        ArrayList arrayListE = e(view);
        for (int i11 = 0; i11 < arrayListE.size(); i11++) {
            if (((u4.c) arrayListE.get(i11)).a() == i10) {
                arrayListE.remove(i11);
                return;
            }
        }
    }

    public static void j(View view, u4.c cVar, u4.n nVar) {
        u4.c cVar2 = new u4.c(null, cVar.f16612b, null, nVar, cVar.f16613c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        b bVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f15691a : new b(accessibilityDelegateC);
        if (bVar == null) {
            bVar = new b();
        }
        l(view, bVar);
        i(view, cVar2.a());
        e(view).add(cVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            h0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void l(View view, b bVar) {
        if (bVar == null && (c(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f15695b);
    }

    public static void m(View view, CharSequence charSequence) {
        new z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).f(view, charSequence);
        a0 a0Var = f15748e;
        if (charSequence == null) {
            a0Var.f15692a.remove(view);
            view.removeOnAttachStateChangeListener(a0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(a0Var);
        } else {
            a0Var.f15692a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(a0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a0Var);
            }
        }
    }

    public static void n(View view, androidx.datastore.preferences.protobuf.j jVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(jVar != null ? new s0(jVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = q0.f15766e;
        View.OnApplyWindowInsetsListener p0Var = jVar != null ? new p0(view, jVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, p0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(p0Var);
        }
    }
}

package l5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b extends t4.b {
    public static final Rect G = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final x9.b H = new x9.b(7);
    public static final y9.a I = new y9.a();
    public final AccessibilityManager A;
    public final Chip B;
    public a C;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9983d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f9984e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f9985f = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final int[] f9986z = new int[2];
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.B = chip;
        this.A = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = l0.f15744a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // t4.b
    public final d8.e b(View view) {
        if (this.C == null) {
            this.C = new a(this, 0);
        }
        return this.C;
    }

    @Override // t4.b
    public final void d(View view, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        this.f15694a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((ue.d) this).J;
        ue.f fVar = chip.f3835e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f17028s0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.i(chip.getAccessibilityClassName());
        eVar.l(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.E != i10) {
            return false;
        }
        this.E = Integer.MIN_VALUE;
        p(i10, false);
        r(i10, 8);
        return true;
    }

    public final u4.e k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        u4.e eVar = new u4.e(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        eVar.i("android.view.View");
        Rect rect = G;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        eVar.f16616b = -1;
        Chip chip = this.B;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i10, eVar);
        if (eVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f9984e;
        eVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        eVar.f16617c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.D == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z2 = this.E == i10;
        if (z2) {
            eVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            eVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f9986z;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f9983d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            eVar.f(rect3);
            if (eVar.f16616b != -1) {
                u4.e eVar2 = new u4.e(AccessibilityNodeInfo.obtain());
                for (int i11 = eVar.f16616b; i11 != -1; i11 = eVar2.f16616b) {
                    eVar2.f16616b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = eVar2.f16615a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i11, eVar2);
                    eVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f9985f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f16615a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.m(int, android.graphics.Rect):boolean");
    }

    public final u4.e n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        Chip chip = this.B;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        u4.e eVar = new u4.e(accessibilityNodeInfoObtain);
        Field field = l0.f15744a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            eVar.f16615a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i10, u4.e eVar);

    public abstract void p(int i10, boolean z2);

    public final boolean q(int i10) {
        int i11;
        Chip chip = this.B;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.E) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.E = i10;
        p(i10, true);
        r(i10, 8);
        return true;
    }

    public final void r(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.A.isEnabled() || (parent = (view = this.B).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            u4.e eVarN = n(i10);
            accessibilityEventObtain.getText().add(eVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = eVarN.f16615a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}

package u4;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import t4.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f16600e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f16601f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f16602g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f16603h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f16604i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f16605k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f16606l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f16607m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f16608n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f16609o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f16610p;

    /* renamed from: a, reason: collision with root package name */
    public final Object f16611a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16612b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16613c;

    /* renamed from: d, reason: collision with root package name */
    public final n f16614d;

    static {
        new c(1, (String) null);
        new c(2, (String) null);
        new c(4, (String) null);
        new c(8, (String) null);
        f16600e = new c(16, (String) null);
        new c(32, (String) null);
        f16601f = new c(64, (String) null);
        f16602g = new c(128, (String) null);
        new c(g.class, 256);
        new c(g.class, 512);
        new c(h.class, 1024);
        new c(h.class, 2048);
        f16603h = new c(4096, (String) null);
        f16604i = new c(8192, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(l.class, 131072);
        j = new c(262144, (String) null);
        f16605k = new c(524288, (String) null);
        f16606l = new c(1048576, (String) null);
        new c(m.class, 2097152);
        int i10 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, j.class);
        f16607m = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f16608n = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f16609o = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f16610p = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, k.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, i.class);
        new c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i10 >= 34 ? v.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f16611a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f16611a;
        Object obj3 = this.f16611a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f16611a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = e.d(this.f16612b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f16611a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public c(Class cls, int i10) {
        this(null, i10, null, null, cls);
    }

    public c(Object obj, int i10, CharSequence charSequence, n nVar, Class cls) {
        this.f16612b = i10;
        this.f16614d = nVar;
        if (obj == null) {
            this.f16611a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f16611a = obj;
        }
        this.f16613c = cls;
    }
}

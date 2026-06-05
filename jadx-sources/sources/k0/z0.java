package k0;

import android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z0[] f9345b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9346a;

    static {
        z0[] z0VarArr = {new z0("Cut", 0, n0.e.f11846a, R.string.cut, R.attr.actionModeCutDrawable), new z0("Copy", 1, n0.e.f11847b, R.string.copy, R.attr.actionModeCopyDrawable), new z0("Paste", 2, n0.e.f11848c, R.string.paste, R.attr.actionModePasteDrawable), new z0("SelectAll", 3, n0.e.f11849d, R.string.selectAll, R.attr.actionModeSelectAllDrawable), new z0("Autofill", 4, n0.e.f11850e, R.string.autofill, 0)};
        f9345b = z0VarArr;
        u0.c.j(z0VarArr);
    }

    public z0(String str, int i10, Object obj, int i11, int i12) {
        this.f9346a = obj;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f9345b.clone();
    }
}

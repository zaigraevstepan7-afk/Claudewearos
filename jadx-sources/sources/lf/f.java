package lf;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10932a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f10933b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f10934c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f10935d;

    static {
        f fVar = new f("UNKNOWN", 0);
        f10932a = fVar;
        f fVar2 = new f("NOT_REQUIRED", 1);
        f10933b = fVar2;
        f fVar3 = new f("REQUIRED", 2);
        f10934c = fVar3;
        f10935d = new f[]{fVar, fVar2, fVar3};
    }

    @RecentlyNonNull
    public static f valueOf(@RecentlyNonNull String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    @RecentlyNonNull
    public static f[] values() {
        return (f[]) f10935d.clone();
    }
}

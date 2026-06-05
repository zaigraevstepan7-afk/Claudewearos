package a9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f219a;

    static {
        a[] aVarArr = {new a("GENERAL_ERROR", 0), new a("VALUE_NOT_FOUND_ERROR", 1), new a("KEY_NOT_REGISTERED_ERROR", 2), new a("VALUE_TO_SET_NOT_MATCHING_KEY", 3), new a("BITMAP_FILE_WRITE_ERROR", 4), new a("BITMAP_FILE_READ_ERROR", 5), new a("BITMAP_FILE_GENERAL_ERROR", 6)};
        f219a = aVarArr;
        u0.c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f219a.clone();
    }
}

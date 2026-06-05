package g7;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends h implements f7.f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f7252b;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f7252b = sQLiteStatement;
    }

    public final int b() {
        return this.f7252b.executeUpdateDelete();
    }
}

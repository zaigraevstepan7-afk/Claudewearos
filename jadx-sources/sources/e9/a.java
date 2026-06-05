package e9;

import com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase_Impl;
import com.anonlab.voidlauncher.core.icons.cache.IconCacheDatabase_Impl;
import fj.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import r5.g;
import u6.u;
import u6.x;
import uk.c;
import yd.f;
import z6.d;
import z6.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5832d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f5833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IconCacheDatabase_Impl iconCacheDatabase_Impl) {
        super(1, "95e8a33f9b8487772677ffa25d6c5bdf", "ed74774f9817b71cf39ad2f5aabf32c4");
        this.f5833e = iconCacheDatabase_Impl;
    }

    @Override // r5.g
    public final void a(e7.a aVar) throws Exception {
        switch (this.f5832d) {
            case 0:
                l.f(aVar, "connection");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS `displayables` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `label` TEXT NOT NULL, `packageName` TEXT NOT NULL, `key` TEXT NOT NULL, `type` TEXT NOT NULL)");
                c.y(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_displayables_key` ON `displayables` (`key`)");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS `dock_displayables` (`dockDisplayableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `index` INTEGER NOT NULL, `displayableId` INTEGER NOT NULL, FOREIGN KEY(`displayableId`) REFERENCES `displayables`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                c.y(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_dock_displayables_displayableId` ON `dock_displayables` (`displayableId`)");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS `grid_displayables` (`gridDisplayableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `index` INTEGER NOT NULL, `displayableId` INTEGER NOT NULL, FOREIGN KEY(`displayableId`) REFERENCES `displayables`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                c.y(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_grid_displayables_displayableId` ON `grid_displayables` (`displayableId`)");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3d8bfb5972c83390fd1a0670a7636971')");
                break;
            default:
                l.f(aVar, "connection");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS `icon_cache` (`key` TEXT NOT NULL, `componentName` TEXT NOT NULL, `packageName` TEXT NOT NULL, `userId` INTEGER NOT NULL, `title` TEXT NOT NULL, `contentDescription` TEXT NOT NULL, `iconBitmap` BLOB, `iconColor` INTEGER NOT NULL, `iconFlags` INTEGER NOT NULL, `isAdaptive` INTEGER NOT NULL, `isLowRes` INTEGER NOT NULL, `lastUpdateTime` INTEGER NOT NULL, `version` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                c.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '95e8a33f9b8487772677ffa25d6c5bdf')");
                break;
        }
    }

    @Override // r5.g
    public final void c(e7.a aVar) throws Exception {
        switch (this.f5832d) {
            case 0:
                l.f(aVar, "connection");
                c.y(aVar, "DROP TABLE IF EXISTS `displayables`");
                c.y(aVar, "DROP TABLE IF EXISTS `dock_displayables`");
                c.y(aVar, "DROP TABLE IF EXISTS `grid_displayables`");
                break;
            default:
                l.f(aVar, "connection");
                c.y(aVar, "DROP TABLE IF EXISTS `icon_cache`");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r5.g
    public final void r(e7.a aVar) {
        switch (this.f5832d) {
        }
        l.f(aVar, "connection");
    }

    @Override // r5.g
    public final void s(e7.a aVar) throws Exception {
        switch (this.f5832d) {
            case 0:
                l.f(aVar, "connection");
                c.y(aVar, "PRAGMA foreign_keys = ON");
                ((DisplayablesDatabase_Impl) this.f5833e).o(aVar);
                break;
            default:
                l.f(aVar, "connection");
                ((IconCacheDatabase_Impl) this.f5833e).o(aVar);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r5.g
    public final void t(e7.a aVar) {
        switch (this.f5832d) {
        }
        l.f(aVar, "connection");
    }

    @Override // r5.g
    public final void u(e7.a aVar) throws Exception {
        switch (this.f5832d) {
            case 0:
                l.f(aVar, "connection");
                u0.l.f(aVar);
                break;
            default:
                l.f(aVar, "connection");
                u0.l.f(aVar);
                break;
        }
    }

    @Override // r5.g
    public final x v(e7.a aVar) throws Exception {
        switch (this.f5832d) {
            case 0:
                l.f(aVar, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new z6.b(1, "id", "INTEGER", null, true, 1));
                linkedHashMap.put("label", new z6.b(0, "label", "TEXT", null, true, 1));
                linkedHashMap.put("packageName", new z6.b(0, "packageName", "TEXT", null, true, 1));
                linkedHashMap.put("key", new z6.b(0, "key", "TEXT", null, true, 1));
                linkedHashMap.put("type", new z6.b(0, "type", "TEXT", null, true, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new d("index_displayables_key", true, f.K("key"), f.K("ASC")));
                e eVar = new e("displayables", linkedHashMap, linkedHashSet, linkedHashSet2);
                e eVarP = u2.b.p(aVar, "displayables");
                if (!eVar.equals(eVarP)) {
                    break;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("dockDisplayableId", new z6.b(1, "dockDisplayableId", "INTEGER", null, true, 1));
                    linkedHashMap2.put("index", new z6.b(0, "index", "INTEGER", null, true, 1));
                    linkedHashMap2.put("displayableId", new z6.b(0, "displayableId", "INTEGER", null, true, 1));
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    linkedHashSet3.add(new z6.c("displayables", "CASCADE", "NO ACTION", f.K("displayableId"), f.K("id")));
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                    linkedHashSet4.add(new d("index_dock_displayables_displayableId", true, f.K("displayableId"), f.K("ASC")));
                    e eVar2 = new e("dock_displayables", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                    e eVarP2 = u2.b.p(aVar, "dock_displayables");
                    if (!eVar2.equals(eVarP2)) {
                        break;
                    } else {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("gridDisplayableId", new z6.b(1, "gridDisplayableId", "INTEGER", null, true, 1));
                        linkedHashMap3.put("index", new z6.b(0, "index", "INTEGER", null, true, 1));
                        linkedHashMap3.put("displayableId", new z6.b(0, "displayableId", "INTEGER", null, true, 1));
                        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                        linkedHashSet5.add(new z6.c("displayables", "CASCADE", "NO ACTION", f.K("displayableId"), f.K("id")));
                        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                        linkedHashSet6.add(new d("index_grid_displayables_displayableId", true, f.K("displayableId"), f.K("ASC")));
                        e eVar3 = new e("grid_displayables", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                        e eVarP3 = u2.b.p(aVar, "grid_displayables");
                        if (!eVar3.equals(eVarP3)) {
                            break;
                        } else {
                            break;
                        }
                    }
                }
            default:
                l.f(aVar, "connection");
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("key", new z6.b(1, "key", "TEXT", null, true, 1));
                linkedHashMap4.put("componentName", new z6.b(0, "componentName", "TEXT", null, true, 1));
                linkedHashMap4.put("packageName", new z6.b(0, "packageName", "TEXT", null, true, 1));
                linkedHashMap4.put("userId", new z6.b(0, "userId", "INTEGER", null, true, 1));
                linkedHashMap4.put("title", new z6.b(0, "title", "TEXT", null, true, 1));
                linkedHashMap4.put("contentDescription", new z6.b(0, "contentDescription", "TEXT", null, true, 1));
                linkedHashMap4.put("iconBitmap", new z6.b(0, "iconBitmap", "BLOB", null, false, 1));
                linkedHashMap4.put("iconColor", new z6.b(0, "iconColor", "INTEGER", null, true, 1));
                linkedHashMap4.put("iconFlags", new z6.b(0, "iconFlags", "INTEGER", null, true, 1));
                linkedHashMap4.put("isAdaptive", new z6.b(0, "isAdaptive", "INTEGER", null, true, 1));
                linkedHashMap4.put("isLowRes", new z6.b(0, "isLowRes", "INTEGER", null, true, 1));
                linkedHashMap4.put("lastUpdateTime", new z6.b(0, "lastUpdateTime", "INTEGER", null, true, 1));
                linkedHashMap4.put("version", new z6.b(0, "version", "INTEGER", null, true, 1));
                e eVar4 = new e("icon_cache", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                e eVarP4 = u2.b.p(aVar, "icon_cache");
                if (!eVar4.equals(eVarP4)) {
                    break;
                } else {
                    break;
                }
        }
        return new x(null, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DisplayablesDatabase_Impl displayablesDatabase_Impl) {
        super(1, "3d8bfb5972c83390fd1a0670a7636971", "d3dd57db5814b4407f68a139226a448d");
        this.f5833e = displayablesDatabase_Impl;
    }
}

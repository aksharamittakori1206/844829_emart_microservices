import { Item } from './Item';
import { Cart } from './Cart';

export interface Bill{
    id: number,
    buyerId: number,
    type: string,
    date: string,
    remarks: string,
    item: Item[],
    amount: number
 

   
}